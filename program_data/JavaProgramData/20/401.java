package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[5]);
		int i;
		int n = 0;
		int l;
		int s = 0;
			while (scanf("%s %s", a, b) != EOF)
			{
			l = a.length();
			int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = a.charAt(0);
			max = p;
			for (i = 0;i < l;i++,p++)
			{
				if (*p > max)
				{
					max = p;
					n = i;
				}
			}
		  for (i = 0;i <= n;i++)
		  {
		  System.out.printf("%c",a.charAt(i));
		  }
		  System.out.printf("%s",b);
		  if (n < l - 1)
		  {
			  for (i = n + 1;i < l - 1;i++)
			  {
			  System.out.printf("%c",a.charAt(i));
			  }
			  System.out.printf("%c\n",a.charAt(l - 1));
		  }
		  else
		  {
			  System.out.print("\n");
		  }


			}
	}

}
