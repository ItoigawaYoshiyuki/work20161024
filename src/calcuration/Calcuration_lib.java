package calcuration;
public class Calcuration_lib {
	  private int m,n;
	  public Calcuration_lib(int m,int n){
		  this.m=m;
		  this.n=n;
		  
	  }
	  public int getPlus(){
		return m+n;
	  }
	  public int getMainasu(){
			return m-n;
		  }
	  public int getKakeru(){
			return m*n;
		  }
	  public double getWaru(){
			return m/n;
		  }
	  public double getAmari(){
			return m%n;
		  }
	}



