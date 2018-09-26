package <missing>;

public class GlobalMembers
{
	/*************************
	??5
	?? - ?????
	???
	2013/10/30
	**************************/
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[10001];
		int cont = 0;
		int i = 1;
		int j;
		int[] t = new int[1000];
		int m = 0;
		char ch;
		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cont++; //??
			ch = System.in.read(); //?????
			i++;
		} while (ch == ','); //??????
		i = 1;
		do
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			i++;
		} while (ch == ',');
		for (i = 1; i <= cont; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				t[j]++; //??????????1
			}
		}
		for (j = 0; j < 1000; j++)
		{
			if (t[j] > m) //????????
			{
				m = t[j];
			}
		}
		System.out.print(cont);
		System.out.print(" ");
		System.out.print(m);
		return 0;
	}

}

