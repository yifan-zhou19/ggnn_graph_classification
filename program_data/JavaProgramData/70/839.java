package <missing>;

public class GlobalMembers
{
	public static final int MAX = 100;

	public static int Main()
	{
	double[] x = new double[MAX];
	double[] y = new double[MAX];
	int n;
	double maxLength = 0; //??????

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++) //?????
	{
	x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}

	double length = 0;
	for (int i = 0;i < n;i++)
	{
	for (int j = i + 1;j < n;j++)
	{
	length = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2)); //????????
	//cout<<i<<":"<<j<<" "<<length<<endl;
	if (length > maxLength)
	{
	maxLength = length;
	}
	}
	}
	System.out.print(maxLength);
	System.out.print("\n");
	return 0;
	}
}

