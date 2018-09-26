void bdx(int,int,int,int);
int main()
{
	for (int z = 1;z < 6;z++)
	{
		for (int q = 1;q < 6;q++)
		{
			for (int s = 1;s < 6;s++)
			{
				for (int l = 1;l < 6;l++)
				{
					if (z + q == s + l && (z + l) > (s + q) && (z + s) < q)
					{
						bdx(z,q,s,l);
					}
				}
			}
		}
	}

return 0;
}

void bdx(int z,int q,int s,int l)
{
	if (z > q)
	{
		System.out.print("l ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
	}
	else if (l > q && q > z && z > s)
	{
		System.out.print("l ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
	}
	else if (l > q && q > s && s > z)
	{
		System.out.print("l ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
	}
	else if (q > l && z > s)
	{
		System.out.print("q ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("l ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
	}
	else if (q > l && l > s && s > z)
	{
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("l ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
	}
	else if (s > l)
	{
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
		System.out.print("l ");
		System.out.print(l * 10);
		System.out.print("\n");
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
	}
}
