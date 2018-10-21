package <missing>;

public class GlobalMembers
{
	public static String input1 = new String(new char[260]);
	public static String input2 = new String(new char[260]);
	public static int[] int1 = new int[260];
	public static int[] int2 = new int[260];
	public static int len1;
	public static int len2;
	public static void sum(int index, int carry)
	{
		if (carry == 0 && index >= len1 != 0 && index >= len2)
		{
			return;
		}
		int1[index] += int2[index] + carry;
		carry = int1[index] / 10;
		int1[index] %= 10;
		sum(index + 1, carry);
		return;
	}
	public static int Main()
	{
		input1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		input2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(int1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(int2,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		len1 = input1.length();
		for (i = len1 - 1,j = 0;i >= 0;i--,j++)
		{
			int1[j] = input1.charAt(i) - '0';
		}
		len2 = input2.length();
		for (i = len2 - 1,j = 0;i >= 0;i--,j++)
		{
			int2[j] = input2.charAt(i) - '0';
		}
		sum(0, 0);
		for (i = len1 > len2 != 0?len1:len2;i >= 0;i--)
		{
			if (int1[i] != 0)
			{
				break;
			}
		}
		if (i < 0)
		{
			System.out.print(0);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(int1[i]);
			}
		}
		return 0;
	}

}

