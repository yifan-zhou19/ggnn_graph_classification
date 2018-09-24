package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			int len;
			int i;
			int j;
			len = a.length();
			for (i = len - 1;i >= 0;i--) //?????????
			{
				if (a[i] == '(')
				{
					for (j = i + 1;j < len;j++)
					{
						if (a[j] == ')')
						{
							a[i] = 'A';
							a[j] = 'B';
							break;
						}
					}
				}
			}
			for (i = 0;i < len;i++) //???????????????????
			{
				if (a[i] == '(')
				{
					System.out.print("$");
				}
				else
				{
					if (a[i] == ')')
					{
						System.out.print("?");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

