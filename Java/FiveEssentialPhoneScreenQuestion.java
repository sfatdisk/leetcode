https://sites.google.com/site/steveyegge2/five-essential-phone-screen-questions

Example 1:   Write a function to reverse a string.

public static String reverse ( String s ) {

	int length= s.length(); 
	if(length<2){ return s; }
	int last= length-1; 

	char[] chars= s.toCharArray();
	for(int i=0; i<length/2 ; ++i ){
		//swap
		char last= chars[last-i];
		chars[last-i] = chars[i];
		chars[i]=last;
	}
	return new String(chars);
}

  