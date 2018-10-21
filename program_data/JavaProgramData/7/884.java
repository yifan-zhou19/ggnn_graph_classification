package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String p3;
		String p;
		String q;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p3 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p1 = new Scanner(System.in).nextLine();
		p2 = new Scanner(System.in).nextLine();
		p3 = new Scanner(System.in).nextLine();
		p = tangible.StringFunctions.strStr(p1,p2);
		if (p == null)
		{
		  System.out.printf("%s",p1);
		}
		else
		{
			for (i = 0;p1 != p;p1++,i++)
			{
		   *(q.Substring(i)) = *p1;
			}
		*(q.Substring(i)) = '\0';
	   for (j = 0;j < p3.length();j++)
	   {
		 *(q.Substring(i) + j) = *(p3.Substring(j));
	   }
		for (j = 0; * (p1 + p2.length() + j) != '\0';j++)
		{
		  *(q.Substring(i) + p3.length() + j) = *(p1 + p2.length() + j);
		}
		 *(q.Substring(i) + p3.length() + j) = '\0';
		 System.out.printf("%s",q);
		}
	}

}

