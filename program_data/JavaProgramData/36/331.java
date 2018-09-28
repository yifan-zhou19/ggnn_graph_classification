package <missing>;

public class GlobalMembers
{
	public static void min(String a, String b)
	{
		char k;
		int i;
		int j;
		for (i = 0;i < a.length() - 1;i++)
		{
		 for (j = 0;j < a.length() - i - 1;j++)
		 {
			 if (a[j].compareTo(a[j + 1]) < 0)
			 {
				 k = a[j];
				 a[j] = a[j + 1];
				 a[j + 1] = k;
			 }
		 }
		}
	   for (i = 0;i < b.length() - 1;i++)
	   {
		 for (j = 0;j < b.length() - i - 1;j++)
		 {
			 if (b[j].compareTo(b[j + 1]) < 0)
			 {
				 k = b[j];
				 b[j] = b[j + 1];
				 b[j + 1] = k;
			 }
		 }
	   }
			 if (strcmp(a,b) == 0)
			 {
				 System.out.print("YES");
			 }
			 else
			 {
				 System.out.print("NO");
			 }
	}
	public static void Main()
	{
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		min(a, b);
	}

}

