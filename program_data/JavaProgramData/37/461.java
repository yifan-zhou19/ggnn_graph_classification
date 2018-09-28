package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String name = new String(new char[100000]);
		int[] sum = new int[26];
		int len;
		int j;
		int temp = 0;
		int i;
		int q;
		int flag = 0;
		String p = new String(new char[10]);
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		name = (char[100000])malloc(100000 * (Character.SIZE / Byte.SIZE) * 20);
		for (i = 0;i < t;i++)
		{
		*(name.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < t;i++)
		{
			flag = 0;
			for (q = 0;q < 25;q++)
			{
				sum[q] = 0;
			}
			len = String.valueOf(*(name.Substring(i))).length();
			for (j = 0;j < len;j++)
			{
				temp = (int) * (*(name.Substring(i)) + j) - 97;
				 sum[temp] = sum[temp] + 1;
			}
				for (j = 0;j < len;j++)
				{
					temp = (int) * (*(name.Substring(i)) + j) - 97;
				if (sum[temp] == 1)
				{
					flag = 1;
					System.out.printf("%c\n",temp + 97);
					break;
				}
				}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

