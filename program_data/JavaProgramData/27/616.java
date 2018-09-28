package <missing>;

public class GlobalMembers
{
	//By Dr.Z


	public static int solve(float a, float b, float c)
	{
	float d = (b * b - 4 * a * c); //?????delta
	float x; //??????
	float y;

	if (d > 0F) //?????
	{
	d = Math.sqrt(d);
	x = -b / a / 2;
	y = d / a / 2;
	System.out.print("x1=");
	System.out.print((x + y));
	System.out.print(";x2=");
	System.out.print((x - y));
	System.out.print("\n");
	}
	else if (d == 0F) //?????
	{
	System.out.print("x1=x2=");
	System.out.print((-b / a / 2));
	System.out.print("\n");
	}
	else //?????
	{
	d = Math.sqrt(-d);
	x = -b / a / 2;
	if (x == 0F)
	{
		x = Math.abs(x);
	}
	y = Math.abs(d / a / 2);
	System.out.print("x1=");
	System.out.print(x);
	System.out.print("+");
	System.out.print(y);
	System.out.print("i;x2=");
	System.out.print(x);
	System.out.print("-");
	System.out.print(y);
	System.out.print("i");
	System.out.print("\n");
	}

	return 0;
	}

	public static int Main()
	{


	int n; //????
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	float[][] S = new float[n][3]; //????????

	for (i = 0;i <= (n - 1);i++) //??????
	{
	for (j = 0;j <= 2;j++)
	{
		S[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	}
	}

	for (i = 0;i <= (n - 1);i++)
	{
	solve(S[i][0], S[i][1], S[i][2]);
	}
	return 0;
	}

}

