package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s=(char*)malloc(256),*s1=(char*)malloc(256),*s2=(char*)malloc(256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 char s = (String)malloc(256);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s1=(char*)malloc(256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 char s1 = (String)malloc(256);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s2=(char*)malloc(256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 char s2 = (String)malloc(256);
	 int i;
	 int j;
	 int k;
	 int m = 0;
	 s = new Scanner(System.in).nextLine();
	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();
	 for (i = 0; * (s + i) != '\0';i++)
	 {
	  for (j = i, k = 0;(*(s + j) != '\0') && (*(s1 + k) != '\0') && (*(s + j) == *(s1 + k));j++, k++)
	  {
		  ;
	  }
	  if (k == s1.length())
	  {
	   for (j = i,k = j + s1.length();k < s.length();k++,j++)
	   {
		*(s + j) = *(s + k);
	   }
	   *(s + j + s2.length()) = '\0';
	   for (j = --j + s2.length(),k = j - s2.length();k >= i;j--,k--)
	   {
		*(s + j) = *(s + k);
	   }
	   for (j = i,k = 0; * (s2 + k) != '\0';j++,k++)
	   {
		*(s + j) = *(s2 + k);
	   }
		m = m + 1;
	  }
	  if (m != 0)
	  {
	  break;
	  }
	 }
	 System.out.println(s);
	}

}
