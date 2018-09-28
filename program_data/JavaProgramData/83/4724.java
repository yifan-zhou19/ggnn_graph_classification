package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shang = {100, 89, 84, 81, 77, 74, 71, 67, 63, 59};
		int[] xia = {90, 85, 82, 78, 75, 72, 68, 64, 60, 0};
		double[] jidian = {4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.5, 1.0, 0};
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] xuefen = new int[n];
		double[] fenshu = new double[n];
		int sumxuefen = 0;
		for (int i = 0; i < n; i++)
		{
			xuefen[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sumxuefen += xuefen[i];
		}
		for (int i = 0; i < n; i++)
		{
			fenshu[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double sum = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (fenshu[i] >= xia[j] != 0 && fenshu[i] <= shang[j])
				{
					fenshu[i] = jidian[j] * xuefen[i];
					sum += fenshu[i];
				}
			}
		}

		double result = sum / sumxuefen;
		System.out.printf("%.2f",result);

		return 0;
	}


}

