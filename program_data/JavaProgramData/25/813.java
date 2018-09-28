package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int N;


		int[] value = new int[1001];

		int i;

		value[1000] = 1;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}




		while (N-- != 0)

		{



			for (i = 1000; i > 0; i--)

			{

				value[i] *= 2;

			}



			for (i = 1000; i > 0; i--)

			{

				if (value[i] >= 10)

				{

					value[i] -= 10;

					value[i - 1] += 1;

				}

			}

		}





		for (i = 0; i <= 1000; i++)

		{

			if (value[i] != 0)

			{

				while (i <= 1000)

				{

					System.out.printf("%d", value[i]);

					++i;

				}



				break;

			}

		}




		return 0;

	}


}

