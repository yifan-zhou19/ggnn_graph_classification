package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String m = new String(new char[20]);
			String n = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(n,0,(Character.SIZE / Byte.SIZE));
			int k;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = tempVar2.charAt(0);
			}
			k = m.length();
			if (m.charAt(k - 3) == 'i')
			{
				for (j = 0;j < k - 3;j++)
				{

					n = tangible.StringFunctions.changeCharacter(n, j, m.charAt(j));
				}
				System.out.printf("%s\n",n);
			}
			else
			{
				for (j = 0;j < k - 2;j++)
				{
					n = tangible.StringFunctions.changeCharacter(n, j, m.charAt(j));
				}
				System.out.printf("%s\n",n);
			}
		}
		return 0;
	}




}

