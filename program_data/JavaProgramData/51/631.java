String str = new String(new char[500]);
int n;
int len;
int num = char * ;

int main()
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = null;
	String s = null;
	int i = 0;
	int[] sum = new int[500];
	int max = 1;
	int j;
	int k = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len = str.length();
	p = str;
	while (p <= str.charAt(len - n))
	{
		sum[i] = num(p);
		p++;
		i++;
	}
	for (i = 0; i <= len - n - 1; i++)
	{
		if (sum[i] > max)
		{
			max = sum[i];
		}
	}
	if (max == 1)
	{
		System.out.print("NO");
		System.out.print("\n");
		return 0;
	}
	System.out.print(max);
	System.out.print("\n");
	for (i = 0; i <= len - n; i++)
	{
		if (sum[i] == max)
		{
			s = str.charAt(i);
			for (j = 1; j <= n; j++, s++)
			{
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}
	return 0;
}

int num(char * q)
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * h = q + 1;
	String c = q;
	String u;
	int m;
	int t = 0;
	int r = 1;
	if (q >= str.charAt(len - n))
	{
		return 1;
	}
	while (h != str.charAt(len - n + 1))
	{
		u = h;
		for (m = 1; m <= n; m++)
		{
			if (*q != *h)
			{
				break;
			}
			else
			{
				t++;
				h++;
				q++;
			}
		}
		if (t == n)
		{
			r++;
		}
		t = 0;
		q = c;
		h = u.Substring(1);
	}
	return r;
}

