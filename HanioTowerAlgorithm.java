public class HanioTowerAlgorithm {
    public Boolean HanioTowerRun(Integer nInteger, String fromPeg, String toPeg, String allPegs) {
        if(nInteger == 0) {
            return true;
        }

        String sparePeg = FindSparePeg(fromPeg, toPeg, allPegs);
        System.out.println("Spare Peg: ".concat(sparePeg).concat(" For N = ").concat(nInteger.toString()));
        HanioTowerRun(nInteger - 1, fromPeg, sparePeg, allPegs);
        MoveDisk(nInteger, fromPeg, toPeg);
        HanioTowerRun(nInteger - 1, sparePeg, toPeg, allPegs);
        return true;
    }    

    private void MoveDisk(Integer nInteger, String fromPeg, String toPeg) {
        System.out.println("Moving Disk ".concat(nInteger.toString()).concat(" From = ").concat(fromPeg).concat(" To = ").concat(toPeg));
    }

    private String FindSparePeg(String fromPeg, String toPeg, String allPegs) {
        return allPegs.replace(fromPeg, "").replace(toPeg, "");
    }
}
