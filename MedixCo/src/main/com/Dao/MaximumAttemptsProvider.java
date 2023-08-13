package com.Dao;

public class MaximumAttemptsProvider
{
    public static int maximumAttempts = 1;

    public static int getMaximumAttempts() {
        return maximumAttempts;
    }
    public static void IncreaseAttempts()
    {
        maximumAttempts += 1;
    }
}