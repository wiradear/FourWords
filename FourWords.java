package question1_1;
//Wirakarn Ponpraserd
//6409650311

public class FourWords {
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private int count=0;
	
	
	public void add(String word) {
		if (count<4) {
			if(word1==null) {
				word1=word;
				count+=1;
			}
			else if(word2==null) {
				word2=word;
				count+=1;
			}
			else if(word3==null) {
				word3=word;
				count+=1;
			}
			else if(word4==null) {
				word4=word;
				count+=1;
			}
			
		}else if(count>=4) {
			System.out.println("Can't add a new word "+ "'" +word+"'"+"!");
		}
	}
	
	public String getMin() {
		String minWord=null;
		if(word1==null && word2==null && word3==null && word4==null) {
			minWord= null;
		}

		else if(word1!=null) {
			minWord = word1;
				if(word2!=null) {
					if(word1.compareTo(word2)<=0) {
						minWord = word1;
					}else minWord=word2;
						if(word3!=null) {
							if(word1.compareTo(word2)<=0 && word1.compareTo(word3)<=0) {
								minWord=word1;
							}
							else if(word2.compareTo(word3)<=0 && word3.compareTo(word1)<=0) {
								minWord=word2;
							}
							else if(word3.compareTo(word1)<=0 && word3.compareTo(word2)<=0) {
								minWord = word3;
							}
							if(word4!=null) {
								if(word1.compareTo(word2)<=0 && word1.compareTo(word3)<=0 && word1.compareTo(word4)<=0) {
									minWord = word1;
								}
								else if(word2.compareTo(word1)<=0 && word2.compareTo(word3)<=0 && word2.compareTo(word4)<=0) {
									minWord = word2;
								}
								else if(word3.compareTo(word1)<=0 && word3.compareTo(word2)<=0 && word3.compareTo(word4)<=0) {
									minWord = word3;
								}
								else if(word4.compareTo(word1)<=0 && word4.compareTo(word2)<=0 && word4.compareTo(word3)<=0) {
									minWord = word4;
							}
						}
					}	
			}
			
		}	
		return minWord;
	}
	
	public String getMax() {
		String maxWord=null;
		if(word1==null && word2==null && word3==null && word4==null) {
			 maxWord = null;
		}

		else if(word1!=null) {
			maxWord = word1;
				if(word2!=null) {
					if(word1.compareTo(word2)>=0) {
						maxWord = word1;
					}else maxWord=word2;
						if(word3!=null) {
							if(word1.compareTo(word2)>=0 && word1.compareTo(word3)>=0) {
								maxWord=word1;
							}
							else if(word2.compareTo(word3)>=0 && word3.compareTo(word1)>=0) {
								maxWord=word2;
							}
							else if(word3.compareTo(word1)>=0 && word3.compareTo(word2)>=0) {
								maxWord = word3;
							}
							if(word4!=null) {
								if(word1.compareTo(word2)>=0 && word1.compareTo(word3)>=0 && word1.compareTo(word4)>=0) {
									maxWord = word1;
								}
								else if(word2.compareTo(word1)>=0 && word2.compareTo(word3)>=0 && word2.compareTo(word4)>=0) {
									maxWord = word2;
								}
								else if(word3.compareTo(word1)>=0 && word3.compareTo(word2)>=0 && word3.compareTo(word4)>=0) {
									maxWord = word3;
								}
								else if(word4.compareTo(word1)>=0 && word4.compareTo(word2)>=0 && word4.compareTo(word3)>=0) {
									maxWord = word4;
								}
						}
					}	
			}	
		}
	
		
		return maxWord;
	}
	
	
	
	
	
	public void printWords() {
		System.out.println("List of words:");
		if(word1!=null) {
			System.out.printf("\t%s\n",word1);
			if(word2!=null) {
				System.out.printf("\t%s\n",word2);
				if(word3!=null) {
					System.out.printf("\t%s\n",word3);
					if(word4!=null) {
						System.out.printf("\t%s\n",word4);
						}
					}
				}
		}
		if(word1==null || word2==null || word3==null || word4==null) {
			System.out.println();
		}
		System.out.printf("The lexicographic minimum is %s\n",getMin());
		System.out.printf("The lexicographic maximum is %s\n",getMax());
		int letter=0;
		if(word1==null&&word2==null&&word3==null&&word4==null) {
			letter=0;	
		}
		else{
			if(word1!=null) {
				letter+=word1.length();
				if(word2!=null) {
					letter+=word2.length();
					if(word3!=null) {
						letter+=word3.length();
						if(word4!=null) {
							letter+=word4.length();
							}
						}
					}
			}
		}
		
		System.out.printf("Total length %d\n",letter);
		if(word1!=null) {
			System.out.printf("Average length %f\n\n",(double)letter/count);
		}
		else if(word2!=null) {
				System.out.printf("Average length %f\n\n",(double)letter/count);
		}
		else if(word3!=null) {
				System.out.printf("Average length %f\n\n",(double)letter/count);
		}
		else if(word4!=null) {
				System.out.printf("Average length %f\n\n",(double)letter/count);
		}
		else {
			System.out.printf("Average length %f\n",(double)(0));
		}
	}
}
