package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int r;
		int n = 0;
		String a = new String(new char[60]);
		String b = new String(new char[60]);
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
		r = a.length();
		t = b.length();
		for (i = 0;i < t && n < 1;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				k = i;
			   for (j = 0;j < r;j++,k++)
			   {
				   c[j] = b.charAt(k);
			   }
			   if (strcmp(c,a) == 0)
			   {
				   n = n + 1;
				   System.out.printf("%d\n",i);
			   }
			}
		}
	}


}

