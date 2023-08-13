package com.Servlets;

import com.Dao.FactoryProvider;
import com.Entities.Medicine;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.hql.internal.ast.SqlASTFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public SearchServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            String searchContent = request.getParameter("searchContent");

            Session session = FactoryProvider.getFactory().openSession();


            SQLQuery fetchMedicineQuery = session.createSQLQuery("SELECT * FROM Medicine INNER JOIN Stock ON Medicine.med_id = Stock.med_id WHERE Medicine.med_name LIKE :x");
            fetchMedicineQuery.setParameter("x", searchContent + "%");
            fetchMedicineQuery.addEntity(Medicine.class);
            List<Medicine> medicineList = fetchMedicineQuery.list();

            session.close();

            request.setAttribute("medicineList", medicineList);
            RequestDispatcher rd = request.getRequestDispatcher("searchresult.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}