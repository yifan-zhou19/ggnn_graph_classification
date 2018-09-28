package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int t;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[20]);
		for (i = 0;i < n;i++)
		{
			t = 0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s = tempVar2.charAt(0);
		   }
		   len = s.length();
		   if (s.charAt(0) == '_' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
		   {
				t++;
		   }
		   for (j = 1;s.charAt(j) != '\0';j++)
		   {
					if (s.charAt(j) >= '0' && s.charAt(j) <= '9' || s.charAt(j) == '_' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
					{
						t++;
					}
		   }
			if (t == len)
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

