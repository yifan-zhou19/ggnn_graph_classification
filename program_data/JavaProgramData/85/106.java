package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		String p = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
		 if (p.charAt(0) >= '0' && p.charAt(0) <= '9')
		 {
			 System.out.print("no\n");
		 }
		 else
		 {
		 for (j = 0,k = 0;j < p.length();j++)
		 {
			 if ((p.charAt(j) >= 'A' && p.charAt(j) <= 'Z') || p.charAt(j) == '_' || (p.charAt(j) >= 'a' && p.charAt(j) <= 'z') || (p.charAt(j) >= '0' && p.charAt(j) <= '9'))
			 {
			 k++;
			 }
		 }
		 if (j == k)
		 {
			 System.out.print("yes\n");
		 }
		 else
		 {
			 System.out.print("no\n");
		 }
		 }
		}
	}

}

