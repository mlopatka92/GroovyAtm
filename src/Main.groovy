class Main {

    static void main(String[] args) {
        def service = new AtmServiceImpl();
        [460, 220, 310, 770, 440].each {println(service.doWithdraw(it))}
    }
}
