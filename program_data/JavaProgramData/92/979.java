package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int leftJi;
		int leftQi;
		int rightJi;
		int rightQi;
		int[] tianJi = new int[1000];
		int[] kingQi = new int[1000];
		int result;

		for ((n; n > 0; cin = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0; i < n; ++i)
			{
				tianJi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; ++i)
			{
				kingQi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			sort(tianJi, tianJi + n);
			sort(kingQi, kingQi + n);

			result = 0;
			leftJi = leftQi = 0;
			rightJi = rightQi = n - 1;

			while (leftJi <= rightJi)
			{
				if (tianJi[leftJi] > kingQi[leftQi])
				{
					++leftJi;
					++leftQi;
					result += 200;
					continue;
				}

				if (tianJi[rightJi] > kingQi[rightQi])
				{
					--rightJi;
					--rightQi;
					result += 200;
					continue;
				}

				if (tianJi[leftJi] < kingQi[rightQi])
				{
					result -= 200;
				}
				++leftJi;
				--rightQi;
			}

			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}
}

