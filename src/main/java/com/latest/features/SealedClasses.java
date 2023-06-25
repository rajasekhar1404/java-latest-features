package com.latest.features;


sealed class UserService permits DBUserService, ADUserService{
    public void onBoard() {
        System.out.println("onboarded successfully");
    }
}

non-sealed class DBUserService extends UserService {
    @Override
    public void onBoard() {

    }
}

non-sealed class ADUserService extends UserService {

    @Override
    public void onBoard() {

    }

}

class AzureUserService
//        extends UserService
{

//    @Override
    public void onBoard() {

    }

}


public class SealedClasses {
    public static void main(String[] args) {

    }
}
