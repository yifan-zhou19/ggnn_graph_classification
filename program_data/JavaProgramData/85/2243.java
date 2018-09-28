package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zs = new String(new char[max + 1]);
		int n;
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs = tempVar2.charAt(0);
			}
			c = 0;

			if (((zs.charAt(0) >= 'a') && (zs.charAt(0) <= 'z')) || ((zs.charAt(0) >= 'A') && (zs.charAt(0) <= 'Z')) || zs.charAt(0) == '_')
			{
					for (j = 1;zs.charAt(j) != '\0';j++)
					{

					  if (((zs.charAt(j) >= 'a') && (zs.charAt(j) <= 'z')) || ((zs.charAt(j) >= 'A') && (zs.charAt(j) <= 'Z')) || (zs.charAt(j) == '_') || ((zs.charAt(j) >= '0') && (zs.charAt(j) <= '9')))
					  {
						   c++;
					  }
					}
					 if (c == zs.length() - 1)
					 {
						System.out.print("yes\n");
					 }
					 else
					 {
						System.out.print("no\n");
					 }

			}
			else
			{
				System.out.print("no\n");
			}

		}

		return 0;
	}

}

