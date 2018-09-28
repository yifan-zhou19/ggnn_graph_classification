package <missing>;

public class GlobalMembers
{
	///???//
	public static int iIndex;
	public static int iIndex1;
	public static int iCount;
	public static int i; //???????
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int n;
	public static double[] x = new double[1000];
	public static double[] y = new double[1000];
	public static double MaxDistance;
	public static double NowDistance;
	/////////////
	/* ???????
	void Input()
	{
	ifstream fin("D:\\Brother\\Kon\\Debug\\message.in");
	fin>>iCount;
	for (i=0; i<iCount; i++)
	fin>>x[i]>>y[i];
	fin.close();
	}
	*/

	public static void _Calculate()
	{
	for (i = 0;i < iCount;i++)
	{
	for (j = i;j < iCount;j++)
	{
	NowDistance = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
	if (NowDistance > MaxDistance)
	{
		MaxDistance = NowDistance;
	}
	}
	}
	}
	public static void Main(String[] args)
	{

	MaxDistance = -1;
	//iIndex=0;iIndex1=0;
	/* ??(x[iIndex],y[iIndex])
	  ???????-1????????~???????????*/
	//->??????????printf("Hello World!\n");
	// ??????????Input();


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		iCount = Integer.parseInt(tempVar);
	}


	for (i = 0;i < iCount;i++)
	{

	x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}

	_Calculate();

	System.out.print(MaxDistance);
	System.out.print("\n");

	}



}

