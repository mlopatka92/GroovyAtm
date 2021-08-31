class AtmServiceImpl implements AtmService {

    def acceptableBanknotes = [200, 100, 50, 20, 10]

    @Override
    Map<Integer, Integer> doWithdraw(int amount) {
        if (amount % 10 != 0) {
            println("Given amount: $amount is incorrect!");
        }

        def banknotesCounts = new HashMap();

        for(nominal in acceptableBanknotes) {
            if (amount >= nominal) {
                def banknoteCount = amount.intdiv(nominal);
                banknotesCounts.put(nominal, banknoteCount);
                amount -= nominal * banknoteCount;
            }
        }

        return banknotesCounts;
    }

}
