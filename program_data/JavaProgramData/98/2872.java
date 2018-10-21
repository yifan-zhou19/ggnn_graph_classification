package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **p=(char **)malloc((n+5)*sizeof(char *));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] p = (String)malloc((n + 5) * sizeof(String));
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 41);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2.charAt(0);
			}
		}
		int count = 0;
		for (int i = 0;i < n;i++)
		{
			if (count == 0)
			{
				System.out.printf("%s",p[i]);
				count += String.valueOf(p[i]).length();
			}
			else
			{
				if (count + String.valueOf(p[i]).length() + 1 <= 80)
				{
					System.out.printf(" %s",p[i]);
					count += (String.valueOf(p[i]).length() + 1);
				}
				else
				{
					System.out.print("\n");
					System.out.printf("%s",p[i]);
					count = String.valueOf(p[i]).length();
				}
			}
		}
	}
}

