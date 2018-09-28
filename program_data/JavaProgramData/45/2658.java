package <missing>;

public class GlobalMembers
{
	public static int set(String s, String w)
	{
		int n1;
		int n2;
		int i;
		int j;
		int sum;
		String p;

		n1 = s.length();
		n2 = w.length();

		for (i = 0;i <= n2 - n1;i++)
		{
			 if (s[0].equals(w[i]))
			 {
				 sum = 0;
				 p = w[i];
				 for (j = 0;j < n1;j++)
				 {
				 if (s[j].equals(p.charAt(j)))
				 {
					 sum++;
				 }
				 }

				 if (sum == n1)
				 {
					 System.out.printf("%d\n",i);
					 i = n2 - n1;
				 }
			 }
		}
	}

	public static int Main()
	{
		  String s = new String(new char[50]);
		  String w = new String(new char[50]);
		  int n;
		  int m;
		  int i;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  w = tempVar2.charAt(0);
		  }
		  set(s, w);

	}

}

