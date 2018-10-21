package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s = new String(new char[4000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * ps;
	   char[][] ss = new char[200][20];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(ss,0,200);
	   int max;
	   int min;
	   int i = 0;
	   int k = 0;
	   s = new Scanner(System.in).nextLine();
	   for (ps = s; * ps != '\0';ps++)
	   {
		if (*ps != ' ')
		{
			if (*ps != ',')
			{
			ss[k][i] = ps;
			i++;
			}
		}
		else
		{
		 k++;
		 i = 0;
		}
	   }
		max = 0;
		min = 0;
		for (i = 0;i <= k;i++)
		{
		 if (String.valueOf(ss[i]).length() > String.valueOf(ss[max]).length())
		 {
		 max = i;
		 }
		 else if (String.valueOf(ss[i]).length() < String.valueOf(ss[min]).length())
		 {
		 min = i;
		 }
		}
	   System.out.println(ss[max]);
	   System.out.println(ss[min]);
	}

}
