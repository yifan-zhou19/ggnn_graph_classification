package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] iin = new int[100];
		int counter = 0;
		for (int i = 0; i < n; i++)
		{
			iin[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			counter = counter + iin[i];
		}

		//cout << counter << endl;

		int buffer = 0;
		for (int i = 0; i < n; i++)
		{
			if (Math.abs((iin[i] * n - counter)) > buffer)
			{
				buffer = Math.abs(iin[i] * n - counter);
			}
		}

		//cout << buffer << endl;

		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i; j < n; j++)
			{
				if (buffer == Math.abs(iin[i] * n - counter) && buffer == Math.abs(iin[i] * n - counter) && (iin[i] > iin[j]))
				{
					swap(iin[i],iin[j]);
				}
			}
		}

		int buffer2 = 0;
		for (int i = 0; i < n; i++)
		{
			if (buffer == Math.abs(iin[i] * n - counter))
			{
				buffer2++;
			}
		}

		for (int i = 0; i < n; i++)
		{
			if (buffer == Math.abs(iin[i] * n - counter) && buffer2 != 1)
			{
				buffer2--;
				System.out.print(iin[i]);
				System.out.print(',');
				continue;
			}
			if (buffer == Math.abs(iin[i] * n - counter) && buffer2 == 1)
			{
				System.out.print(iin[i]);
			}
		}
		return 0;
	}

}

