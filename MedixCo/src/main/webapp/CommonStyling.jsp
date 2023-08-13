
<nav class="navbar">
    <a class="navbar-brand" href="#">
        <img src="MedixCo.png" alt="Logo" height="30">
    </a>
    <form id="SearchForm" class="form-inline search-bar" action="SearchServlet">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
    </form>


        <a class="nav-link" href="Home.jsp">Home</a>
        <a class="nav-link" href="CartServlet">My Cart</a>
        <a class="nav-link" href="About.jsp">About</a>
        <div class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="myProfileDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                My Profile
            </a>
            <div class="dropdown-menu" aria-labelledby="myProfileDropdown">
                <a class="dropdown-item" href="MyAccount.jsp">My Account</a>
                <a class="dropdown-item" href="OrderHistoryServlet">Order History</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="LogoutServlet">Logout</a>
            </div>
        </div>
    </div>
</nav>
