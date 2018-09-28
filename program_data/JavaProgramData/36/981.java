package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[50]);
	public static String w = new String(new char[50]);
	public static int len1;
	public static int len2;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len1 = s.length();
		len2 = w.length();
		void paixu(char x[],int len);
		if (len1 != len2)
		{
			System.out.print("NO");
		}
		else
		{
			paixu(s, len1);
			paixu(w, len2);
			if (strcmp(s,w) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}

	public static void paixu(String x, int len)
	{
		 int i;
		 int j;
		 char t;
		 for (i = 0;i <= len - 2;i++)
		 {
		   for (j = i + 1;j <= len - 1;j++)
		   {
			 if (x[j].compareTo(x[i]) > 0)
			 {
				 t = x[j];
				 x[j] = x[i];
				 x[i] = t;
			 }
		   }
		 }
	}

}

