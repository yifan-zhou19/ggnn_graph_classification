import java.util.*;

int high = new int(int *, int *,int);
final int maxmax = 200;
String a = new String(new char[maxmax + 1]);
String b = new String(new char[maxmax + 1]);
int[] aa = new int[maxmax + 1];
int[] bb = new int[maxmax];
int main()
{
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(aa, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(bb, 0, (Integer.SIZE / Byte.SIZE));
	int length1 = a.length();
	int length2 = b.length();
	int i;
	int j;
	for (i = 0, j = length1 - 1; j >= 0; j--)
	{
		aa[i++] = a.charAt(j) - '0';
	}
	for (i = 0, j = length2 - 1; j >= 0; j--)
	{
		bb[i++] = b.charAt(j) - '0';
	}
	if (aa[0] == 0 && bb[0] == 0)
	{
		System.out.print(0);
		System.out.print("\n");
	}
	else
	{
		int highest = high(aa, bb, maxmax + 1);
		for (i = highest; i >= 0; i--)
		{
			System.out.print(aa[i]);
		}
	}
	return 0;
}
int high(int * a1, int * b1, int m)
{
	int d;
	for (int i = 0; i < m; i++)
	{
		a1[i] += b1[i];
		if (a1[i] >= 10)
		{
			a1[i] -= 10;
			a1[i + 1] += 1;
		}
		if (a1[i] != 0)
		{
			d = i;
		}
	}
	return d;
}
