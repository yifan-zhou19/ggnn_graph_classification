int couple = int;
String a = new String(new char[100]);
int len;
int[] b = new int[100];

int main()
{
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len = a.length();
	couple(0);
	return 0;
}

int couple(int i)
{
	int j;
	for (int k = i; k < len; k++)
	{
		while (b[i] == 1)
		{
			i++;
		}
		if (a.charAt(i) == a.charAt(0))
		{
			b[i] = 1;
			j = couple(i + 1);
			System.out.print(i);
			System.out.print(" ");
			System.out.print(j);
			System.out.print("\n");
		}
		else
		{
			b[i] = 1;
			return i;
		}
	}
}


