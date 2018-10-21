int match = int;
String a = new String(new char[105]);
char b;

int main()
{
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);

	b = a.charAt(0);

	match(0);

	return 0;
}

int match(int p)
{
	if (a.charAt(p) == b)
	{
		int q = match(p + 1);
		System.out.print(p);
		System.out.print(" ");
		System.out.print(q);
		System.out.print("\n");
		return match(q + 1);
	}
	else
	{
		return p;
	}
}

