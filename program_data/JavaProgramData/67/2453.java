package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zong = new int[1000];
		int[] hao = new int[1000];
		int n;
		int i;
		float[] xiaol = new float[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		zong[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		hao[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		xiaol[0] = (float)hao[0] / zong[0];
		for (i = 1;i < n;i++)
		{
			zong[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			hao[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			xiaol[i] = (float)hao[i] / zong[i];
		}
		for (i = 1;i < n;i++)
		{
			if (xiaol[i] < xiaol[0] - 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (xiaol[i] > xiaol[0] + 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

