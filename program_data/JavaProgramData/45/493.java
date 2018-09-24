package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int l;
		int k;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
		n = s.length();
		l = a.length();
		for (j = 0;j < n;j++)
		{
					   if (s.charAt(j) == a.charAt(0))
					   {
					 k = j;
			System.out.printf("%d\n",k);
				  break;
					   }
		}


	}

}

