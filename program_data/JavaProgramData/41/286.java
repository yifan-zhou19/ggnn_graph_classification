package <missing>;

public class GlobalMembers
{
	//????:????
	//?????2011?11?
	//???????
	public static int Main()
	{
	int A; //????
	int B;
	int C;
	int D;
	int E;
	int a;
	int b;
	int c;
	int d;
	int e;
	for (A = 1;A <= 5;A++)
	{
	for (B = 1;B <= 5;B++)
	{
	if (A != B)
	{
	for (C = 1;C <= 5;C++)
	{
	if ((B != C) && (A != C))
	{
	for (D = 1;D <= 5;D++)
	{
	if ((D != A) && (D != B) && (D != C)) //???????A?B?C?D?E????
	{
	for (E = 1;E <= 5;E++)
	{
	if ((E != A) && (E != B) && (E != C) && (E != D))
	{
	if ((E != 2) && (E != 3))
	{
	a = (E == 1); //????????
	b = (B == 2);
	c = (A == 5);
	d = (C != 1);
	e = (D == 1);
	if (((A + a) * (B + b) * (C + c) * (D + d) * (E + e) == 360) && ((A - a) * (B - b) * (C - c) * (D - d) * (E - e) == 0)) //?????????????????????????????????????????????360?????0
	{
	System.out.print(A);
	System.out.print(" ");
	System.out.print(B);
	System.out.print(" ");
	System.out.print(C);
	System.out.print(" ");
	System.out.print(D);
	System.out.print(" ");
	System.out.print(E);
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	return 0;
	}
}
