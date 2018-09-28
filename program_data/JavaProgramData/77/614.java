package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[1000]);
	public static int search(int a)
	{
		int i;
		int j;
		int flag = 0;
		for (i = a - 1;i >= 0;i--)
		{
			if ((line.charAt(i) + line.charAt(a) == line.charAt(line.length() - 1) + line.charAt(0)) && (flag == 0))
			{
				for (j = a - 1;j >= 0;j--)
				{
					if (line.charAt(j) == line.charAt(line.length() - 1))
					{
						search(j);
						break;
					}
				}
				if (j == 0)
				{
				return 0;
				}
				System.out.print(i);
				System.out.print(" ");
				System.out.print(a);
				System.out.print("\n");
				break;
			}
			if (line.charAt(i) + line.charAt(a) != line.charAt(line.length() - 1) + line.charAt(0))
			{
			flag++;
			}
			if ((line.charAt(i) + line.charAt(a) == line.charAt(line.length() - 1) + line.charAt(0)) && (flag != 0))
			{
			flag--;
			}
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(line, 0, (Character.SIZE / Byte.SIZE));
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		search(line.length() - 1);
		return 0;
	}

}

