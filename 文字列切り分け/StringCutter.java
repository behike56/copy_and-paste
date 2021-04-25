class StringCutter{
    /**
     * @param rawStr 切り分け前文字列
     * @param cutPoint 切り分け点
     * @return resultList 切り分けたリスト
     */
    public List<String> cyclePointSlicer(String rawStr, List<Integer> cutPoint){

	List<String> resultList = new ArrayList<>();
	String tempStr = "";
	int start = 0;
	int end = 0;
	
	for (Integer cut: cutPoint) {
	    end = cut;
	    tempStr = rawStr.subString(start, end);
	    resultList.add(tempStr);
	    start += end;
	}

	return resultList;
    }
}
