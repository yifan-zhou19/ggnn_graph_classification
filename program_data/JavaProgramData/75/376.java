import java.util.*;

String a = new String(new char[100000]);
String b = new String(new char[100000]);
int power = new int(int, int);
int main()
{
	int[] a1 = new int[1000];
	int[] b1 = new int[1000];
	int i;
	int j;
	int k;
	int count;
	int num = 0;
	int n;
	int m;
	int[] time = new int[1000];
	int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(time, 0, (Integer.SIZE / Byte.SIZE));
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	k = 0;
	count = 0;
	for (i = 0; ; i++)
	{
		if (a.charAt(i) == ',')
		{
			m = 0;
			n = count - 1;
			for (j = i - count; j < i; j++)
			{
				m = m + (a.charAt(j) - '0') * power(10, n--);
			}
			a1[k++] = m;
			num++;
			count = 0;
		}
		else if (a.charAt(i) == '\0')
		{
			m = 0;
			n = count - 1;
			for (j = i - count; j < i; j++)
			{
				m = m + (a.charAt(j) - '0') * power(10, n--);
			}
			a1[k++] = m;
			num++;
			break;
		}
		else
		{
			count++;
		}
	}
	k = 0;
	count = 0;
	for (i = 0; ; i++)
	{
		if (b.charAt(i) == ',')
		{
			m = 0;
			n = count - 1;
			for (j = i - count; j < i; j++)
			{
				m = m + (b.charAt(j) - '0') * power(10, n--);
			}
			b1[k++] = m;
			count = 0;
		}
		else if (b.charAt(i) == '\0')
		{
			m = 0;
			n = count - 1;
			for (j = i - count; j < i; j++)
			{
				m = m + (b.charAt(j) - '0') * power(10, n--);
			}
			b1[k++] = m;
			break;
		}
		else
		{
			count++;
		}
	}
	for (i = 0; i <= num; i++)
	{
		for (j = a1[i]; j < b1[i]; j++)
		{
			time[j]++;
		}
	}
	for (i = 0; i < 1000; i++)
	{
		if (time[i] > max)
		{
			max = time[i];
		}
	}
	System.out.print(num);
	System.out.print(" ");
	System.out.print(max);
	System.out.print("\n");
	return 0;
}
int power(int i, int j)
{
	int k;
	int m = 1;
	for (k = 0; k < j; k++)
	{
		m = m * i;
	}
	return m;
}
