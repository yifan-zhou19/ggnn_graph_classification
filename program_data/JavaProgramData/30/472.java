package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int n = 0;
		int[] wei = new int[10];
		int i = 0;
		float c = 0F;
		float d = 0F;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 10 != 7 && (i / 10) % 10 != 7 && i % 7 != 0)
			{
				a = a + i * i;

			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

