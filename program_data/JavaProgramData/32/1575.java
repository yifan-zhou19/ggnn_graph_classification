package <missing>;

public class GlobalMembers
{
	public static void chuli(String a, String b)
	{


	  int la;
	  int m;
	  int i;
	  int j;

	  m = b.length();
	  la = a.length();
	  for (i = 0;i < m;i++)
	  {
		  if (a[la - 1 - i].compareTo(b[m - 1 - i]) >= 0)
		  {
			  a[la - 1 - i] = a[la - 1 - i] - b[m - 1 - i].Substring(48);
		  }
		  else
		  {

			  a[la - 1 - i] = a[la - 1 - i].Substring(10) - b[m - 1 - i].Substring(48);
			  j = la - 2 - i;
			  while (a[j].equals(48))
			  {
				  a[j] = 48 + 9;
				  j--;
			  }
			  a[j] = a[j] - 1;

		  } //*elsewai end
	  } //*for end
	  i = 0;
	  while (a[i].equals(48))
	  {
		  i = i + 1;
	  }

		  System.out.printf("%s\n",a);

	}
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char p;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}

		}
		for (i = 0;i < m;i++)
		{
			chuli(a[i], b[i]);
		}
	}

}

