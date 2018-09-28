package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		int n;
		String a = new String(new char[105]);
		int[] b = new int[55];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'0',(Character.SIZE / Byte.SIZE));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) == '0')
			{
				n = i - 1;
				break;
			} //????????
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
				b[m] = i;
				m++; //??????m????????i????????
			}
			else if (a.charAt(i) != a.charAt(0)) //??????
			{
				System.out.print(b[m - 1]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				m--; //?????????????
			}
		}
		return 0;
	}
}

