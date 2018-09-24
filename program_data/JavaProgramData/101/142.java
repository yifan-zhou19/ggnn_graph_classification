package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
	int a; //??????
	int b;
	int c;
	int A;
	int B;
	int C;
	int[] say = new int[3]; //????????
	for (a = 0;a <= 3;a++)
	{
		for (b = 0;b <= 3;b++)
		{
			for (c = 0;c <= 3;c++)
			{ //????????
				say[0] = (b > a) + (c == a);
				say[1] = (a > b) + (a > c);
				say[2] = (c > b) + (b > a); //???????????????
				if (!(a <= b != 0 && say[0] <= say[1] != 0 || a <= c != 0 && say[0] < say[2] || b <= a != 0 && say[1] <= say[0] != 0 || b <= c != 0 && say[1] <= say[2] != 0 || c <= a != 0 && say[2] <= say[0] != 0 || c <= b != 0 && say[2] <= say[1]))
				{ //??????????????????????
						A = a;
						B = b;
						C = c;
				}
			}
		}
	}
	if (A >= B != 0 && B >= C)
	{
		System.out.print("CBA");
		System.out.print("\n");
	}
	if (A >= C != 0 && C >= B)
	{
		System.out.print("BCA");
		System.out.print("\n");
	}
	if (B >= A != 0 && A >= C)
	{
		System.out.print("CAB");
		System.out.print("\n");
	}
	if (B >= C != 0 && C >= A)
	{
		System.out.print("ACB");
		System.out.print("\n");
	}
	if (C >= A != 0 && A >= B)
	{
		System.out.print("BAC");
		System.out.print("\n");
	}
	if (C >= B != 0 && B >= A)
	{
		System.out.print("ABC");
		System.out.print("\n");
	} //??????????
	return 0;
	}
}
