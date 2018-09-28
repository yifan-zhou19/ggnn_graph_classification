package <missing>;

public class GlobalMembers
{
	public static int judge(String a)
	{
			  int i;
			  int l;
			  l = a.length();
			  if ((a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0) || (a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || a[0].equals('_'))
			  {
				 for (i = 1;i < l;i++)
				 {
							  if ((a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0) || (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || a[i].equals('_') || (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0))
							  {
								  continue;
							  }
							  else
							  {
								  break;
							  }
				 }
				 if (i == l)
				 {
					 return 1;
				 }
				 else
				 {
					 return 0;
				 }
			  }
			  else
			  {
				  return 0;
			  }
	}
	public static int Main()
	{
		int n;
		int x;
		int i;
		String a = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						a = new Scanner(System.in).nextLine();
						x = judge(a);
						System.out.printf("%d\n",x);
		}
		System.in.read();
		System.in.read();
	}

}

