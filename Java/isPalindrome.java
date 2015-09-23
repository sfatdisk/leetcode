
public boolean isPalindrome(String str){
	
	if(str.length==0){ return false; }
	int r= str.length-1; 
	int l=0;
	while(l<r){
		if(str.charAt(l)!=str.charAt(r)){
			return false;
		}
		l++;
		r--;
	}
	return true;
}