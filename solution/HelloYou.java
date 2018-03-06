class HelloYou {

	public static String sayHello(String firstname) {
        if (firstname.equals("")) {
            firstname = "User";
        }
        return String.format("Hello %s", firstname);
    }
}
