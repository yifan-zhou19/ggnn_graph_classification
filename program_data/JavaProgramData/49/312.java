package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc((Character.SIZE / Byte.SIZE) * 500);
	 p = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int k;
	 int flag;
	 for (j = 1;j < p.length();j++)
	 {
	  for (i = 0;i < p.length() - 1;i++)
	  {
		  flag = 1;
	   if (i + j <= p.length())
	   {
	   for (k = 0;k < j / 2 + 1;k++)
	   {
	   if (*(p.Substring(i) + k) != *(p.Substring(i) + j - k))
	   {
		   flag = 0;
		   break;
	   }
	   }
	   if (flag != 0)
	   {
		   for (k = i;k <= i + j;k++)
		   {
		System.out.printf("%c",*(p.Substring(k)));
		   }
		System.out.print("\n");
	   }
	   }
	  }
	 }
	}
}
