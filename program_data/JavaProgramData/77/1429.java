String a = new String(new char[100]);
char b;
int w;
int find = int;
int main()
{
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = a.charAt(0);
	find(0);
	System.in.read();
	System.in.read();
	return 0;
}

int find(int j)
{
	w = j;
	if (a.charAt(j) != b)
	{
		return j;
	}
	else
	{
		System.out.print(j);
		System.out.print(" ");
		System.out.print(find(j + 1));
		System.out.print("\n");
		return find(w + 1);
	}
	return 0;
}

