package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int m; //????
		int n;
		int i = 0;
		int j = 0;
		int k = 1;
		float sum = 0F;
		float f;
		float x = 2F;
		float y = 1.0F;
		float t;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (i = 0;i < m;i++)
		{ //????????
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
				f = x / y;
				sum = sum + f;
				t = x;
				x = x + y;
				y = t;
			}
			System.out.printf("%.3f", sum);
			System.out.printf("%.3f", "\n");
			sum = 0F;
			x = 2F;
			y = 1F;
		}
		return 0; //?????
	}
}

