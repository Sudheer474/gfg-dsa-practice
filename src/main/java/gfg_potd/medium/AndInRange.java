package gfg_potd.medium;

class AndInRange {
    public int andInRange(int l, int r) {
        int xl = (l > 0) ? (31 - Integer.numberOfLeadingZeros(l)) : 0;
        int xr = (r > 0) ? (31 - Integer.numberOfLeadingZeros(r)) : 0;

        int ans = 0;

        while (xl > 0 && xl == xr) {
            ans += (1 << xr);
            l -= (1 << xr);
            r -= (1 << xr);
            xl = (l > 0) ? (31 - Integer.numberOfLeadingZeros(l)) : 0;
            xr = (r > 0) ? (31 - Integer.numberOfLeadingZeros(r)) : 0;
        }
        if (xl == 0 && xl == xr) {
            ans++;
        }
        return ans;
    }
}