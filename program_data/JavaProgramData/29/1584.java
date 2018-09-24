package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0; //??????m??????k?j
		int k = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m;k++) //????m???
		{
			int n = 0; //?????n??
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			float sum = 0F; //?????
			float a = 1F; //????????????
			float b = 2F;
			for (j = 0;j < n;j++) //??
			{
				sum += b / a; //?????a/b
				b = a + b;
				a = b - a; //ab??????ab
			}
			System.out.printf("%.3f", sum);
			System.out.printf("%.3f", '\n');
		}
		return 0;
	}
}

