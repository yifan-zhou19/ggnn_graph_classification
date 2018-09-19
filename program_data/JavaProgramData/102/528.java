package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String flag = new String(new char[10]);
		float temp;
		float[] boy = new float[1000];
		float[] girl = new float[1000];
		int k;
		int i;
		int j = 0;
		int z = 0;
		int lenb = 0;
		int leng = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ; k < n; k++)
		{
			flag = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(flag, "female") == 0)
			{
				leng++;
				girl[j++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				lenb++;
				boy[z++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < lenb - 1; i++)
		{
			for (j = 0; j < lenb - 1 - i; j++)
			{
				if (boy[j] > boy[j + 1])
				{
					temp = boy[j];
					boy[j] = boy[j + 1];
					boy[j + 1] = temp;
				}
			}
		}

		for (i = 0; i < leng - 1; i++)
		{
			for (j = 0; j < leng - 1 - i; j++)
			{
				if (girl[j] < girl[j + 1])
				{
					temp = girl[j];
					girl[j] = girl[j + 1];
					girl[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < lenb; i++)
		{
			System.out.printf("%.2f", boy[i]);
			System.out.printf("%.2f", ' ');
		}
		for (i = 0; i < leng - 1; i++)
		{
			System.out.printf("%.2f", girl[i]);
			System.out.printf("%.2f", ' ');
		}

		System.out.printf("%.2f", girl[i]);

		return 0;
	}


}

